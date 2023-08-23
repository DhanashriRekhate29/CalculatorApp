package tostring;

public class Hospital 
{
String name;
String location;
long mobno;

public Hospital(String name,String location,long mobno)
{

	this.name=name;
	this.location=location;
	this.mobno=mobno;
}
@Override
public String toString()
{
	return"name:-"+name+ "Location:-"+location+ "Mobno:-"+mobno;
}
}
