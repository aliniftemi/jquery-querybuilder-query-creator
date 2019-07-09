package ro.ibt.querybuildercreator.models;

import java.util.ArrayList;
import java.util.List;

import ro.ibt.querybuildercreator.enums.Condition;
import ro.ibt.querybuildercreator.interfaces.RuleInterface;

public class RuleGroup implements RuleInterface
{

	private Condition condition;

	private List<RuleInterface> rules;

	private boolean not;

	public RuleGroup(Condition condition, boolean not) {

		rules = new ArrayList<RuleInterface>();
		this.condition = condition;
		this.not = not;
	}

	public Condition getCondition() {

		return this.condition;
	}

	public List<RuleInterface> getRules() {

		return this.rules;
	}

	public RuleInterface add(RuleInterface rule) {

		this.rules.add(rule);
		return this;
	}

	public RuleInterface remove(RuleInterface rule) {

		this.rules.remove(rule);
		return this;
	}

	public boolean isNot() {

		return this.not;
	}
}
