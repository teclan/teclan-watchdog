package teclan.wathdog.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teclan.wathdog.services.DefaultService;


@RestController  
public class ServerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerController.class);

	@Autowired
	private DefaultService defaultService;

	@RequestMapping(value = "/restart" ,method = RequestMethod.POST)
	@ResponseBody
	public JSONObject restart() {
		return defaultService.doRestart();
	}


	@RequestMapping(value = "/shell" ,method = RequestMethod.POST)
	@ResponseBody
	public JSONObject reboot(@RequestParam(value="shell") String shell) {
		return defaultService.doShell(shell);
	}

}
