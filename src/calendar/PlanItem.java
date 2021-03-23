
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PlanItem {
	public Date planDate;
	public String detail;
	public String people ="";
	
	public PlanItem(String strDate, String detail) {
		try {
			planDate = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.detail = detail;
		
	}
	public void addPeople(String name) {
		this.people += name+",";
	}
	
	public Date getDate() {
		return planDate;
	}
}
