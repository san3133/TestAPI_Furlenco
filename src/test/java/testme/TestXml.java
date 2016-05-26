package testme;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utils.read_xml;
import properties.Constant;

public class TestXml {

	// xml_read x = new xml_read();
	Constant c = new Constant();
	read_xml x = new read_xml();

	@Test

	public void testit() throws SAXException, IOException, ParserConfigurationException {

		String mia = x.readXML(c.test, "New_Orders", "buid_ex");
		System.out.println(mia);

	}
}
