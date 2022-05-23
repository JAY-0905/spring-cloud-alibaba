/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.examples;

import org.apache.dubbo.config.annotation.DubboReference;

/**
 * @author fangjian
 */
public class FooServiceConsumer {

	@DubboReference(version = "${foo.service.version}",
			application = "${dubbo.application.id}",
			url = "dubbo://localhost:12345?version=1.0.0", timeout = 30000)
	private FooService fooService;

	public String hello(String name) {
		return fooService.hello(name);
	}

}