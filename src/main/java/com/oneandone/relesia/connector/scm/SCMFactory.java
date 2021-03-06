/*
 * 
 * Copyright (c) 2016 1&1 Internet SE.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.oneandone.relesia.connector.scm;

import com.oneandone.relesia.connector.scm.git.GitConnector;

public class SCMFactory {
	
	public SCMConnector getSCM(String scmType){
		if(scmType.equalsIgnoreCase("git")){
			return new GitConnector();
		}else if (scmType.equalsIgnoreCase("bitbucket")){
			return new GitConnector();
		}else if (scmType.equalsIgnoreCase("svn")){
			//TODO : Implement SVN Connector
			return null;
		}else if (scmType.equalsIgnoreCase("cvs")){
			//TODO : Implement CVS Connector
			return null;
		}
		return null;
	}
	
}
