package day_2;

public class InternationalCD extends CD {
  private String language;

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

@Override
public String getDetails() {
	// TODO Auto-generated method stub
	return super.getDetails()+"language is "+language;
}

  
}
