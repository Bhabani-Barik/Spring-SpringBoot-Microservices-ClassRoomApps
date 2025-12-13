package com.kanha.controller;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {
	
	
	// ServletConfig & ServletContext objects to controller class handler method, by inject them to @Controller class through 
	// @Autowired annotation
	@Autowired
	private  ServletConfig servletConfig;
	@Autowired
	private  ServletContext servletContext;

	
	// Best way of representing SharedMemory because, it makes the code non-invasive. [Good Practice]
	// @RequestMapping("/")
	// @RequestMapping("/home")
	/* public String showHomePage(BindingAwareModelMap map) {
		
		// add model attributes in shared memory
		map.put("name", "armaan");
		map.put("systemDate", new Date());
		
		// return LVN
		return "welcome";
		}  */
	
	
	
	// Best way of representing SharedMemory because, it makes the code non-invasive. [Good Practice]
	/* @RequestMapping("/home")
	public String showHomePage(Map<String, Object> map) {
		// add model attributes
		map.put("name", "Suman");
		map.put("systemDate", new Date());
		
		// return LVN
		return "welcome";
	} */
	
	
	
	// Model(I) ---> Spring api specific interface i.e- makes code invasive [bad practice]
	/*@RequestMapping("/home")
	public String showHome(Model model) {
		System.out.println("ShowHomeController.showHome():: " + model.getClass());
		// add model attributes to shared memory
		model.addAttribute("name", "Prateek");
		model.addAttribute("systemDate", LocalDateTime.now());
		
		// return LVN
		return "welcome";
		
	} */
	
	
	
	// ModelMap(c) ---> Spring api specific interface i.e- makes code invasive [bad practice]
		/* @RequestMapping("/home")
		public String showHome(ModelMap model) {
			System.out.println("ShowHomeController.showHome():: " + model.getClass());
			// add model attributes to shared memory
			model.addAttribute("name", "Bhabani");
			model.addAttribute("systemDate", LocalDateTime.now());
			
			// return LVN
			return "welcome";
			
		} */
	
	
	
	
	// TAKING HANDLER METHOD RETURN TYPE AS MODEL(I)
	// Here, we need to create SharedMemory to place the model attributes manually, moreover the LVN will be the request path itself.
	/* @RequestMapping("/home") // Here LVN is the request path
	public Model showHomePage() {
		System.out.println("ShowHomeController.showHomePage()");
		// Manually create shared memory
		Model model = new BindingAwareModelMap();

		// add model attributes to shared memory
		model.addAttribute("name", "Raja");
		model.addAttribute("systemDate", new Date());
		return model;

	} */
	
	
	// TAKING HANDLER METHOD RETURN TYPE AS Map<String, Object>
	/* @RequestMapping("/home")
	  public  Map<String,Object>   showHomePage() {
		System.out.println("ShowHomeController.showHomePage()");
		// create  shared memory
		Map<String,Object> map=new HashMap<String, Object>(); // Here, HashMap object acts as the Shared Memory
		
		// add model attributes to shared memory 
		map.put("name","Indrani");
		map.put("systemDate", new Date());
	    return map;
	  } */
	
	
	
	// TAKING HANDLER METHOD RETURN TYPE AS ModelAndView(legacy Style)
	/* @RequestMapping("/home")
	  public  ModelAndView showHomePage() {
		System.out.println("ShowHomeController.showHomePage()");
		
		// create  shared memory
		ModelAndView mav = new ModelAndView(); // Here, ModelAndView Class object acts as the SharedMemory.
		
		// add model attributes to shared memory 
		mav.addObject("name","Indrani");
		mav.addObject("systemDate", new Date());
	    
		// Place LVN to ModelAndView Object
		mav.setViewName("welcome");
		
		return mav;
	  } */
	
	
	// If return type of Handler Method is void
	/* @RequestMapping("/home")  // The Request path of the handler method will be taken as the LVN
	  public  void showHomePage(Map<String, Object> map) {
		System.out.println("ShowHomeController.showHomePage()");
		
		// add model attributes to shared memory
		map.put("name", "Abhipsha");
		map.put("systemDate", new Date());
	  } */
	
	
	// If Handler Method returns null
		/* @RequestMapping("/home")  // The Request path of the handler method will be taken as the LVN
		  public  String showHomePage(Map<String, Object> map) {
			System.out.println("ShowHomeController.showHomePage()");
			
			// add model attributes to shared memory
			map.put("name", "Muna");
			map.put("systemDate", new Date());
			
			return null;
		} */
	
	
	
	// FORWARD REQUEST FROM ONE HANDLER METHOD TO ANOTHER HANDLER METHOD
	/* @RequestMapping("/home")
	public String showHomePage(Map<String, Object> map) {
		System.out.println("ShowHomeController.showHomePage()");

		// add model attributes in shared memory
		map.put("name", "Raja");
		map.put("systemDate", new Date());

		// return LVN
		return "forward:report";
	}

	@RequestMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("ShowHomeController.showReport()");
		map.put("age", new Random().nextInt(40));
		return "show_report";

	} */
	
	
	
	// REDIRECT REQUEST FROM ONE HANDLER METHOD TO ANOTHER HANDLER METHOD
	/* @RequestMapping("/home")
	public String showHomePage(Map<String, Object> map) {
		System.out.println("ShowHomeController.showHomePage()");

		// add model attributes in shared memory
		map.put("name", "raja");
		map.put("systemDate", new Date());

		// return LVN
		return "redirect:report?p1=val1&p2=val2";
	}

	@RequestMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("ShowHomeController.showReport()");

		// add model attribute in Shared Memory
		map.put("age", new Random().nextInt(40));
		return "show_report";

	} */
	
	
	// Get request, response & session object in handler method
	// @RequestMapping("/")
	/* @RequestMapping("/home")
	public String showHomePage(Map<String, Object> map, HttpServletRequest req, HttpServletResponse res,
			HttpSession ses) {
		
		System.out.println("ShowHomeController.showHomePage()::" + map.getClass());
		
		// add model attributes in shared memory
		map.put("name", "Tom");
		map.put("systemDate", new Date());
		
		// Print in Command Line Interface
		System.out.println("request  uri ::" + req.getRequestURI());
		System.out.println("resonse content type::" + res.getStatus());
		System.out.println("Sesssion Id::" + ses.getId());
		System.out.println("DS logical name ::" + servletConfig.getServletName());
		System.out.println("Server info ::" + servletContext.getServerInfo());
		
		// return LVN
		return "welcome";
	} */
	
	
	
	// Send output from handler method directly to browser without involving ViewResolver and ViewComponent
	@RequestMapping("/home")
	public void showHomePage(HttpServletResponse res) throws Exception {
		
		// get PrintWriter object
		PrintWriter pw = res.getWriter();
		
		// set response contemt type
		res.setContentType("text/html");
		
		// make the output as downloadabe file content
		// res.addHeader("content-disposition", "attachment;fileName=abc.html");
		res.addHeader("content-disposition", "inline");
		
		// write the output to browser
		pw.println("<b> welcome to model attributes </b>");

	}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
