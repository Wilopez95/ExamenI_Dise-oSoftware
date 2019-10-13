package Login;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LoginSingleton {

    private static LoginSingleton singleton;
    org.w3c.dom.Document document;
    private NodeList data = null;

    private LoginSingleton(){
        readxml();
    }

    private static synchronized void createinstance(){
        if(singleton == null){
            singleton =  new LoginSingleton();
        }
    }

    public static LoginSingleton getInstance(){
        if(singleton == null){
            createinstance();
        }
        return singleton;
    }

    private void readxml(){
        try {
            File archivo = new File("D:/Documentos/IntelliJProjects/ExamenIDiseno/src/Login/Usuarios.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            data = document.getElementsByTagName("Usuario");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int Login(String user , String pass){
        for (int i = 0; i < data.getLength(); i++) {
            Node nodo = data.item(i);
            Element element = (Element) nodo;
            String id = element.getAttribute("id");
            if((element.getElementsByTagName("Correo").item(0).getTextContent().equals(user)) & (element.getElementsByTagName("Contraseña").item(0).getTextContent().endsWith(pass))){

                return Integer.parseInt(id);
            }
        }
        return 0;
    }



}
