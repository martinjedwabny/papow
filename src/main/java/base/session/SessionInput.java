package main.java.base.session;

import java.io.Serializable;
import java.util.Vector;

import main.java.base.Alternative;
import main.java.base.CategoryFamily;
import main.java.base.Question;
import main.java.base.Vote;
import main.java.base.Voter;

/**
 * SessionInput
 * 
 * The session data to be processed by voting rules.
 * Stores the static data to be loaded and used.
 *
 */
public class SessionInput implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Vector<Question> questions;
	private Vector<Vote> votes;
	private Vector<Voter> voters;
	private Vector<CategoryFamily> families;
	private Vector<Alternative> alternatives;
	
	/**
	 * Empty constructor
	 */
	public SessionInput() {
		super();
		this.questions = new Vector<Question>();
		this.votes = new Vector<Vote>();
		this.voters = new Vector<Voter>();
		this.families = new Vector<CategoryFamily>();
		this.alternatives = new Vector<Alternative>();
	}

	/**
	 * Default constructor
	 * @param questions
	 * @param votes
	 * @param voters
	 * @param families
	 * @param alternatives
	 */
	public SessionInput(Vector<Question> questions, Vector<Vote> votes, Vector<Voter> voters,
			Vector<CategoryFamily> families, Vector<Alternative> alternatives) {
		super();
		this.questions = questions;
		this.votes = votes;
		this.voters = voters;
		this.families = families;
		this.alternatives = alternatives;
	}

	/**
	 * @return questions
	 */
	public Vector<Question> getQuestions() {
		return questions;
	}

	/**
	 * @return votes
	 */
	public Vector<Vote> getVotes() {
		return votes;
	}

	/**
	 * @return voters
	 */
	public Vector<Voter> getVoters() {
		return voters;
	}

	/**
	 * @return families of categories
	 */
	public Vector<CategoryFamily> getFamilies() {
		return families;
	}

	/**
	 * @return the alternatives
	 */
	public Vector<Alternative> getAlternatives() {
		return alternatives;
	}
	
}
