package practice.rmg.git.paramaterization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetGitRepo_Forall_User {

	
@Test(dataProvider="provideDataFor_getAllRepo")
	
	public void getAllRepoForUser(String par1,String par2) {
	
}
		@DataProvider
		public Object[][] provideDataFor_getAllRepo() {
			Object[][] objarr=new Object[4][2];
			objarr[0][0]="Aanchal2325ch";
			objarr[1][1]="created";
			objarr[2][0]="Akshay-Kumar95";
			objarr[2][1]="created";
             return objarr;

			
		}


}

