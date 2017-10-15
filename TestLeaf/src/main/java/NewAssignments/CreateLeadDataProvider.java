package NewAssignments;

import org.testng.annotations.Test;

import wrappers.TestLeafWrapper;



public class CreateLeadDataProvider extends TestLeafWrapper{
	@Test(dataProvider= "fetchData", groups="smoke")
	
	public void createLeadTest(String FN,String LN,String CN, String PN) {
		
		clickByLink("Create Lead");
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", LN);
		enterById("createLeadForm_companyName", CN);
		selectVisibileTextById("createLeadForm_dataSourceId", "Existing Customer");
	    selectIndexById("createLeadForm_marketingCampaignId",2);
	    enterById("createLeadForm_primaryPhoneNumber", PN);
	    enterById("createLeadForm_primaryEmail", "angu.saran.92@gmail.com");
	    clickByName("submitButton");
        verifyTextByXpath("//span[@id='viewLead_firstName_sp']", "Angel");

	}

}
