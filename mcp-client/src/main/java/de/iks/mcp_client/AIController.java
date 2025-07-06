package de.iks.mcp_client;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prompt")
public class AIController {

	ChatModel chatModel;
	SyncMcpToolCallbackProvider toolCallbackProvider;

	public AIController(ChatModel chatModel, SyncMcpToolCallbackProvider toolCallbackProvider) {
		this.chatModel = chatModel;
		this.toolCallbackProvider = toolCallbackProvider;
	}

	@PostMapping()
	public String promptAI(@RequestBody String prompt) {
		return ChatClient.create(chatModel)
				.prompt(prompt)
				.toolCallbacks(toolCallbackProvider.getToolCallbacks())
				.call()
				.chatResponse()
				.getResult()
				.getOutput()
				.getText();
	}
}
