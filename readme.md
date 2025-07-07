# MCP Client/Server Demo
Demo Projekt für eine einfach Client/Server MCP Architektur mit Spring Boot.

---
## Technologien
* Java 21 ☕
* Spring Boot 3.5.3 🍃
* Spring AI 1.0.0 🤖
* Docker 🐋

---
## Lokale Einrichtung
* OpenAI API Key erstellen: https://platform.openai.com/api-keys
* OpenAI API Key in *mcp-client/src/main/resources/application.yml* einfügen:</br>
```yaml
spring:
  ai:
    mcp:
      client:
        sse:
          connections:
            mcp-server:
              url: http://mcp-server:8080
    openai:
      api-key: # OpenAI API Key
```
* Container aus Root starten:
```shell
docker compose up
```
