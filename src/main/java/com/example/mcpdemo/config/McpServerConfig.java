package com.example.mcpdemo.config;

import com.example.mcpdemo.tool.HelpDeskTools;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/*
This class exposes all the tools that we have in our MCP server. Every tool is
an item in the list of ToolCallback. ToolCallback interface represents a tool whose
execution can be triggered by an AI model.
 */
@Configuration
public class McpServerConfig {
    @Bean
    List<ToolCallback> toolCallbacks(HelpDeskTools helpDeskTools) {
        return List.of(ToolCallbacks.from(helpDeskTools));
    }
}
