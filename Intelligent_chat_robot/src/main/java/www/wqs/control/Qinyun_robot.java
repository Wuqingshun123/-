package www.wqs.control;

import com.google.gson.Gson;
import www.wqs.entity.Response;

public class Qinyun_robot implements Parse_json{
    @Override
    public Response parse_json(String json) {
        Gson gson = new Gson();
        Response response = gson.fromJson(json, Response.class);
        return response;
    }
}
