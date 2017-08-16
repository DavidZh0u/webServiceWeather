import mywebServices.WeatherWebService;
import mywebServices.WeatherWebServiceLocator;
import mywebServices.WeatherWebServiceSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) throws ServiceException, RemoteException {

        //建立第一个接口的实例类
        WeatherWebService service=
                new WeatherWebServiceLocator();

        //建立第二个接口实例类
        WeatherWebServiceSoap_PortType portType=
                service.getWeatherWebServiceSoap();

        //传入一个 城市获取该城市的天气情况
        String[] citys = portType.getWeatherbyCityName("肇庆");
        for (String city:citys){
            System.out.println(city);
        }
    }
}
