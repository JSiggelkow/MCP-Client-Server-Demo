package de.iks.mcp_server;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class AirConditionerService {

	@Tool(
			name = "get_status_of_air_conditioner",
			description = "Return the status, temperature and mode of the air conditioning system."
	)
	public String airConditionerStatus() {
		return "Status: UP, Temperature: 23 C°, Mode: Silent";
	}
}
