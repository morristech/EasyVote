/*******************************************************************************
 * #  Copyright 2015 SecUSo.org / Jurlind Budurushi / Roman J�ris
 * #
 * #  Licensed under the Apache License, Version 2.0 (the "License");
 * #  you may not use this file except in compliance with the License.
 * #  You may obtain a copy of the License at
 * #
 * #      http://www.apache.org/licenses/LICENSE-2.0
 * #
 * #  Unless required by applicable law or agreed to in writing, software
 * #  distributed under the License is distributed on an "AS IS" BASIS,
 * #  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * #  See the License for the specific language governing permissions and
 * #  limitations under the License.
 *******************************************************************************/
package de.tud.vcd.eVotingTallyAssistance.common.exceptions;

public class CandidateNotFoundException extends VotingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CandidateNotFoundException() {
		
	}

	public CandidateNotFoundException(String message) {
		super(message);
		
	}

	public CandidateNotFoundException(Throwable cause) {
		super(cause);
		
	}

	public CandidateNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CandidateNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
