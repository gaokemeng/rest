//package com.gkm.rest;
//
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//import org.springframework.http.HttpRequest;
//import org.springframework.stereotype.Controller;
//
//import com.adapter.utils.OFDUtil;
////import com.baiwang.ofd.dto.Message;
//import com.sun.research.ws.wadl.Request;
//
//@Controller
//@Path("/util")
//public class HelloWorld {
//
//	@Path("/hello")
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    public String hello() {
//		System.out.println("welcome!");
//		String ubl = readFile("/Users/tradeshift/Desktop/ubl_sample.txt");
//		System.out.println(ubl);
//		String status = null;
//		Map<String,String> param = new HashMap<String,String>();
//		param.put("url", "http://localhost:8080/rest/util/receive");
//		param.put("invoiceId", "invoiceId");
//		try {
//			//status = OFDUtil.getOfd("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Invoice xmlns:ext=\"urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2\"xmlns:cac=\"urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2\"xmlns:cbc=\"urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2\"xmlns=\"urn:oasis:names:specification:ubl:schema:xsd:Invoice-2\"><ext:UBLExtensions><ext:UBLExtension><ext:ExtensionContent><bw:BaiwangExtensionContent xmlns:bw=\"http://www.baiwang.com.cn/baiwanginvoiceext\"><bw:InvoiceIssueReqSeqNumber>499099992660</bw:InvoiceIssueReqSeqNumber><bw:InvoiceIssueDeviceIdentifier>499099991232</bw:InvoiceIssueDeviceIdentifier><bw:InvoiceCode>24578854</bw:InvoiceCode><bw:CryptoCode>03887/600*8601/5+&gt;&gt;07&lt;&gt;644139+668-4*/&lt;2-*429/0-+-36*8/&lt;2603*69367+/&gt;074+-5&gt;1//8--7*35553/*000001&lt;9441907&lt;8013110</bw:CryptoCode><bw:CheckCode>11398914463913647863</bw:CheckCode><bw:QRCode></bw:QRCode><bw:InvoiceIssuerPersonnelName>bw0701</bw:InvoiceIssuerPersonnelName><bw:ReviewerName>bw0701</bw:ReviewerName><bw:OriginalInvoiceCode>1500000001</bw:OriginalInvoiceCode><bw:OriginalInvoiceNumber>22213458</bw:OriginalInvoiceNumber><bw:KeyPairList><bw:KeyPair><bw:key>name1</bw:key><bw:value>Öµ1</bw:value></bw:KeyPair><bw:KeyPair><bw:key>中文</bw:key><bw:value>Öµ2</bw:value></bw:KeyPair></bw:KeyPairList></bw:BaiwangExtensionContent></ext:ExtensionContent></ext:UBLExtension></ext:UBLExtensions><cbc:ID>150003521011</cbc:ID><cbc:IssueDate>2015-12-24</cbc:IssueDate><cbc:IssueTime>16:32:51.0Z</cbc:IssueTime><cbc:InvoiceTypeCode listAgencyID=\"6\" listID=\"UN/ECE 1001 Subset\" listVersionID=\"D08B\">380</cbc:InvoiceTypeCode><cbc:Note>±¸×¢</cbc:Note><cac:AccountingSupplierParty><cbc:CustomerAssignedAccountID>11010800000000000007</cbc:CustomerAssignedAccountID><cac:Party><cac:PartyIdentification><cbc:ID>8888</cbc:ID></cac:PartyIdentification><cac:PartyName><cbc:Name>°ÙÍú¹É·Ý7</cbc:Name></cac:PartyName><cac:PostalAddress><cbc:StreetName>11111</cbc:StreetName></cac:PostalAddress></cac:Party></cac:AccountingSupplierParty><cac:AccountingCustomerParty><cbc:CustomerAssignedAccountID>499099991232111</cbc:CustomerAssignedAccountID><cac:Party><cac:PartyIdentification><cbc:ID>11</cbc:ID></cac:PartyIdentification><cac:PartyName><cbc:Name>11111</cbc:Name></cac:PartyName><cac:PostalAddress><cbc:StreetName>11</cbc:StreetName></cac:PostalAddress></cac:Party><cac:BuyerContact><cbc:Telephone></cbc:Telephone><cbc:ElectronicMail>gaokemeng@baiwang.com</cbc:ElectronicMail></cac:BuyerContact></cac:AccountingCustomerParty><cac:PayeeParty><cac:PartyName><cbc:Name>bw0701</cbc:Name></cac:PartyName></cac:PayeeParty><cac:TaxTotal><cbc:TaxAmount currencyID=\"CNY\">51.00</cbc:TaxAmount></cac:TaxTotal><cac:LegalMonetaryTotal><cbc:LineExtensionAmount currencyID=\"CNY\">300.00</cbc:LineExtensionAmount><cbc:TaxExclusiveAmount currencyID=\"CNY\">51.00</cbc:TaxExclusiveAmount><cbc:TaxInclusiveAmount currencyID=\"CNY\">351.00</cbc:TaxInclusiveAmount><cbc:PayableAmount currencyID=\"CNY\">351.00</cbc:PayableAmount></cac:LegalMonetaryTotal><cac:InvoiceLine><cbc:ID>1</cbc:ID><cbc:Note>0</cbc:Note><cbc:InvoicedQuantity unitCode=\"\">1.000000</cbc:InvoicedQuantity><cbc:LineExtensionAmount currencyID=\"CNY\">100.00</cbc:LineExtensionAmount><cac:TaxTotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxSubtotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxCategory><cbc:Percent>0.17</cbc:Percent><cac:TaxScheme/></cac:TaxCategory></cac:TaxSubtotal></cac:TaxTotal><cac:Item><cbc:Name>23</cbc:Name><cbc:ModelName>guige</cbc:ModelName></cac:Item><cac:Price><cbc:PriceAmount currencyID=\"CNY\">100.00</cbc:PriceAmount></cac:Price></cac:InvoiceLine><cac:InvoiceLine><cbc:ID>2</cbc:ID><cbc:Note>0</cbc:Note><cbc:InvoicedQuantity unitCode=\"\">1.000000</cbc:InvoicedQuantity><cbc:LineExtensionAmount currencyID=\"CNY\">100.00</cbc:LineExtensionAmount><cac:TaxTotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxSubtotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxCategory><cbc:Percent>0.17</cbc:Percent><cac:TaxScheme/></cac:TaxCategory></cac:TaxSubtotal></cac:TaxTotal><cac:Item><cbc:Name>23</cbc:Name><cbc:ModelName>guige</cbc:ModelName></cac:Item><cac:Price><cbc:PriceAmount currencyID=\"CNY\">100.00</cbc:PriceAmount></cac:Price></cac:InvoiceLine><cac:InvoiceLine><cbc:ID>3</cbc:ID><cbc:Note>0</cbc:Note><cbc:InvoicedQuantity unitCode=\"\">1.000000</cbc:InvoicedQuantity><cbc:LineExtensionAmount currencyID=\"CNY\">100.00</cbc:LineExtensionAmount><cac:TaxTotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxSubtotal><cbc:TaxAmount currencyID=\"CNY\">17.00</cbc:TaxAmount><cac:TaxCategory><cbc:Percent>0.17</cbc:Percent><cac:TaxScheme/></cac:TaxCategory></cac:TaxSubtotal></cac:TaxTotal><cac:Item><cbc:Name>23</cbc:Name><cbc:ModelName>guige</cbc:ModelName></cac:Item><cac:Price><cbc:PriceAmount currencyID=\"CNY\">100.00</cbc:PriceAmount></cac:Price></cac:InvoiceLine></Invoice>", param);
//		status = OFDUtil.getOfd(ubl, param);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(status);
//        return "Welcome!";
//    }
//	
//	/*@Path("/xml")
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public Message getXml(String message){
//		
//		Message msg = null;
//		try {
//			JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);
//			Unmarshaller um = jaxbContext.createUnmarshaller();  
//	        msg = (Message)um.unmarshal(new ByteArrayInputStream(message.getBytes())); 
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//         
//		return msg;
//	}*/
//	
//	@Path("/receive")
//	@POST
//	public String Receive(@Context HttpServletRequest request){
//		InputStream is = null;
//		FileOutputStream fos = null;
//		try  
//        {  
//			is = request.getInputStream(); 
//			fos = new FileOutputStream("/Users/tradeshift/Desktop/OFD"+System.currentTimeMillis()+".zip");
//			
//			byte[] b = new byte[1024];
//			while((is.read(b)) != -1){
//			fos.write(b);
//			}
//			
//        } catch (Exception e)  
//        {  
//            e.printStackTrace();  
//        }finally {
//        	try {
//				is.close();
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		return "6000";
//	}
//	public static String readFile(String filePath) {
//		String line; // 用来保存每行读取的内容
//		StringBuffer sb = new StringBuffer();
//		InputStream is = null;
//		BufferedReader reader = null;
//		try {
//			is = new FileInputStream(filePath);
//			reader = new BufferedReader(new InputStreamReader(is));
//			line = reader.readLine(); // 读取第一行
//			while (line != null) { // 如果 line 为空说明读完了
//				sb.append(line.trim()); // 将读到的内容添加到 buffer 中
//				//sb.append("\n"); // 添加换行符
//				line = reader.readLine(); // 读取下一行
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//
//			try {
//				if (reader != null) {
//					reader.close();
//				}
//				if (is != null) {
//					is.close();
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		return sb.toString();
//	}
//}
