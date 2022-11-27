import java.util.*;
import java.io.*;
import javax.xml.stream.*;
public class StaxParserDemo{
	public static void main(String[]  args)throws XMLStreamException{
		List<Employee> empList=null;
		Employee currEmp=null;
		String tagContent=null;
		XMLInputFactory factory=XMLInputFactory.newInstance();
		InputStream is=ClassLoader.getSystemResourceAsStream("employee.xml");
		XMLStreamReader reader=factory.createXMLStreamReader(is);
		while(reader.hasNext()){
			int event=reader.next();
			switch(event){
				case XMLStreamConstants.START_ELEMENT: 
				if("employee".equals(reader.getLocalName()))
				{
					currEmp=new Employee();
					currEmp.id=reader.getAttributeValue(0);
				}
				if("employees".equals(reader.getLocalName()))
				{
					empList=new ArrayList<>();
				}
				break;
				case XMLStreamConstants.CHARACTERS:tagContent=reader.getText().trim();
				break;
				case XMLStreamConstants.END_ELEMENT:switch(reader.getLocalName()){
					case"employee":empList.add(currEmp);
					break;
					case "firstname":
					currEmp.firstname=tagContent;
					break;
					case "lastname":
					currEmp.lastname=tagContent;
					break;
					case "location":
					currEmp.location=tagContent;
					break;
				}break;
				case XMLStreamConstants.START_DOCUMENT:empList=new ArrayList<>();
				break;
			}
		}
		for(Employee  emp:empList){
			System.out.println(emp);
		}
	}
}


class Employee{
	String id,firstname,lastname,location;
	@Override
	public String toString(){
		return firstname+" "+lastname+" "+location+"("+id+")";
	}
}