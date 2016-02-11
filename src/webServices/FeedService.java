package webServices;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.FeedObjects;
import model.ProjectManager;
  
@Path("/message")
public class FeedService {
	@GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
	@GET
	@Path("/GetFeeds")
	@Produces("application/json")
	public String feed()
	{
	String feeds = null;
	try 
	{
	ArrayList<FeedObjects> feedData = null;
	ProjectManager projectManager= new ProjectManager();
	feedData = projectManager.GetFeeds();
	Gson gson = new Gson();
	System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);
	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
}
