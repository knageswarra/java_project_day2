package day_2;

public class SpecialEditionCD extends CD{
   private String features;

public String getFeatures() {
	return features;
}

public void setFeatures(String features) {
	this.features = features;
}

@Override
public String getDetails() {
	// TODO Auto-generated method stub
	return super.getDetails()+"features:"+features;
}
   
   
}
