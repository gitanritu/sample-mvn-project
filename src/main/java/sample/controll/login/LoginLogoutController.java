package sample.controll.login;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("auth")
public class LoginLogoutController {
    private static final String FW_TO_LOGIN_PAGE = "common/login";

    protected static Logger logger = Logger.getLogger("controller");

    public LoginLogoutController() {
        System.out.println("LoginLogoutController");
    }

//    @RequestMapping(value = "/topMenu",method=RequestMethod.GET)
//    public String showtopMenu(){
//        System.out.println("topMenu");
//        return "topMenu";
//    }
    @RequestMapping(value = "/login",method=RequestMethod.GET)
    public String showLoginPage(){
        System.out.println("FW_TO_LOGIN_PAGE");
        return FW_TO_LOGIN_PAGE;
    }

    @RequestMapping(value = "/login",params={"failure"},method = {RequestMethod.GET, RequestMethod.POST})
    public String failure(){
        System.out.println("failure.......");
        return FW_TO_LOGIN_PAGE;
    }

    @RequestMapping(value = "/login",params={"success"},method = {RequestMethod.GET, RequestMethod.POST})
    public String success(){
        System.out.println("success.......");
        return "common/topMenu";
    }
    /**
     * 指向登录页面
     */
    @RequestMapping(value = "/login1", method = RequestMethod.GET)
    public String getLoginPage(
//            @RequestParam(value = "error", required = false)
           boolean error,
            ModelMap model)
    {

        logger.debug("Received request to show login page");

        if (error == true) {
            // Assign an error message
            model.put("error",
                    "You have entered an invalid username or password!");
        } else {
            model.put("error", "");
        }
        return "loginpage";

    }

    /**
     * 指定无访问额权限页面
     *
     * @return
     */
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String getDeniedPage() {

        logger.debug("Received request to show denied page");

        return "deniedpage";

    }

}