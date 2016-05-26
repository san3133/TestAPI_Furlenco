package testme;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utils.xml_read;
import properties.Constant;

public class TestXml {

	xml_read x = new xml_read();
	Constant c = new Constant();

	@Test(enabled = false)

	public void testme() throws SAXException, IOException, ParserConfigurationException {
		String mia = x.readXML("New_Orders", "companyname");
		System.out.println(mia);
	}

}
