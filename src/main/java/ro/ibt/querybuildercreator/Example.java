package ro.ibt.querybuildercreator;

import com.google.gson.Gson;

import ro.ibt.querybuildercreator.enums.Condition;
import ro.ibt.querybuildercreator.enums.Operator;
import ro.ibt.querybuildercreator.enums.Type;
import ro.ibt.querybuildercreator.exceptions.RuleConstructionException;
import ro.ibt.querybuildercreator.models.Rule;
import ro.ibt.querybuildercreator.models.RuleGroup;

public class Example
{
	public static void main(String[] args) throws ClassNotFoundException, RuleConstructionException {

		Rule rule1 = new Rule("name", Type.STRING, Operator.EQUAL, "Mistic");

		Rule rule2 = new Rule("category", Type.INTEGER, Operator.IN, new int[] { 1, 2 });
		Rule rule3 = new Rule("in_stock", Type.INTEGER, Operator.EQUAL, 0);
		RuleGroup ruleGroup2 = new RuleGroup(Condition.OR, true);
		ruleGroup2.add(rule2);
		ruleGroup2.add(rule3);

		RuleGroup ruleGroup1 = new RuleGroup(Condition.AND, true);
		ruleGroup1.add(rule1);
		ruleGroup1.add(ruleGroup2);

		System.out.println((new Gson()).toJson(ruleGroup1));
	}
}
