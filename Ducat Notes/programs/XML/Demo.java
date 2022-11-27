import java.util.ArrayList;
import java.util.List;
import java.io.*;
import javax.xml.stream.*;

public class Demo
{
    public static void main(String args[]) throws XMLStreamException
    {
        List<Employee> empList=null;
        Employee currEmp=null;
        String tagContent=null;

        XMLInputFactory factory=XMLInputFactory.newInstance();
        InputStream is=ClassLoader.getSystemResourseAsStream("employee.xml");
        XMLStreamReader reader=factory.createXMLStreamReader(is);
        while(reader.hasNext())
        {
            int event=reader.next();
            switch(event)
            {
                case XMLStreamConstants.START_ELEMENT:
                if(employee.equals(reader.getLocalNames()))
                {
                    currEmp=new Employee();
                    currEmp.id=reader.getAttributeValue(0);
                }
                if("employees".equals(reader.getLocalName()))
                {
                    empList=new ArrayList<>();
                }
            }
        }
    }
}