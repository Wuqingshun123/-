package www.wqs.service;

import www.wqs.control.Qinyun_robot;
import www.wqs.entity.Response;

public class Service {

    public static Qinyun_robot robot = new Qinyun_robot();

    public static Response getResponse(String url){
        return robot.parse_json(url);
    }
}
