package com.github.tecuilacat.commons.api;

import java.util.List;

public record TaskStarter(String serverUrl, List<String> members, List<String> modules, List<String> logDirectories) {

}
