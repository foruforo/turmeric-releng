/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.plugins.stubs;

import org.apache.maven.plugin.logging.SystemStreamLog;

/**
 * Simple stub to enable debug logging in the mojo during unit testing.
 */
public class DebugEnabledLog extends SystemStreamLog {
	@Override
	public boolean isDebugEnabled() {
		return true;
	}
}
