
package NewAssignments;

import org.testng.annotations.Test;

import wrappers.TestLeafWrapper;



public class CreateLeadInvoctionCount extends TestLeafWrapper{
	@Test(invocationCount=2,invocationTimeOut=180000)
	public void createLeadTest() {
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "AthenaHealth");
		enterById("createLeadForm_firstName", "Angel");
		enterById("createLeadForm_lastName", "Benjamin");
		selectVisibileTextById("createLeadForm_dataSourceId", "Existing Customer");
	    selectIndexById("createLeadForm_marketingCampaignId",2);
	    enterById("createLeadForm_primaryPhoneNumber", "8886468748");
	    enterById("createLeadForm_primaryEmail", "angu.saran.92@gmail.com");
	    clickByName("submitButton");
        verifyTextByXpath("//span[@id='viewLead_firstName_sp']", "Angel");

	}

}
