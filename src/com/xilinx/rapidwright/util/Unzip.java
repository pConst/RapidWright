/*
 * 
 * Copyright (c) 2018 Xilinx, Inc. 
 * All rights reserved.
 *
 * Author: Chris Lavin, Xilinx Research Labs.
 *
 * This file is part of RapidWright. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */


package com.xilinx.rapidwright.util;

/**
 * Simple tool for unziping files that is platform agnostic.
 * Created on: May 4, 2018
 */
public class Unzip {
	public static void main(String[] args) {
		if(args.length != 2){
			MessageGenerator.briefMessageAndExit("USAGE: <zip file> <dest dir>");
		}
		FileTools.unzipFile(args[0], args[1]);
	}
}
