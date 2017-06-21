package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JMYE on 6/20/17.
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/job") // This means URL's start with /demo (after Application path)
public class JobController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private JobRepository jobRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewJob (@RequestParam String jtitle
            , @RequestParam String jtype) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Jobs j = new Jobs();
        j.setjobTitle(jtitle);
        j.setjobType(jtype);
        jobRepository.save(j);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Jobs> getAllJobs() {
        // This returns a JSON or XML with the users
        return jobRepository.findAll();
    }



}

