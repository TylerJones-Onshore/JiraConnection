package jiraObjects;

public class IssueTypeEnum {
	public enum TypeCode{
		EPIC(10000),
		STORY(10001),
		TASK(10002),
		SUBTASK(10003),
		ZephyrTest(10100),
		BUG(10200);
		
		private final int issueCode;
		
		public int getIssueCode() {
			return issueCode;
		}
		
		private TypeCode(int codeId){
			issueCode = codeId;
		}
	}
}