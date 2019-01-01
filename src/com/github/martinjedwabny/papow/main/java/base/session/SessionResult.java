package com.github.martinjedwabny.papow.main.java.base.session;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.martinjedwabny.papow.main.java.base.Question;
import com.github.martinjedwabny.papow.main.java.base.Voter;
import com.github.martinjedwabny.papow.main.java.base.criterion.Criterion;
import com.github.martinjedwabny.papow.main.java.base.ordering.Ballot;
import com.github.martinjedwabny.papow.main.java.base.rules.VotingRule;

/**
 * SessionResult
 *
 * Represents the unformatted output of a Session (a voting session with a set of rules and questions).
 * 
 */
public class SessionResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	Map<Criterion, List<Voter>> validVoters;
	Map<Question, Map<Criterion, Map<VotingRule, Ballot>>> results;
	
	/**
	 * Empty constructor
	 */
	public SessionResult() {
		this.validVoters = new HashMap<Criterion, List<Voter>>();
		this.results = new HashMap<Question, Map<Criterion, Map<VotingRule, Ballot>>>();
	}

	/**
	 * Default Constructor
	 * @param validVoters
	 * @param results
	 */
	public SessionResult(Map<Criterion, List<Voter>> validVoters, 
			Map<Question, Map<Criterion, Map<VotingRule, Ballot>>> results) {
		super();
		this.validVoters = validVoters;
		this.results = results;
	}
	
	/**
	 * @return the validVoters
	 */
	public Map<Criterion, List<Voter>> getValidVoters() {
		return validVoters;
	}

	/**
	 * @return the results
	 */
	public Map<Question, Map<Criterion, Map<VotingRule, Ballot>>> getResults() {
		return results;
	}
}