package com.sn.dk.config;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import java.util.Date;

public class JobCompletionNotificationListener extends JobExecutionListenerSupport {


	public JobCompletionNotificationListener() {

	}
	
	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("########## job terminé "+new Date()+ " ##########");

		if( jobExecution.getStatus() == BatchStatus.COMPLETED ){
			System.out.println("---->>> job success");

				// Envoyer un mail de notification

				// deplacer les fichiers traites

			} else if(jobExecution.getStatus() == BatchStatus.FAILED){
				//job failure
			System.out.println("---->>> job echec");

		}

	}

	@Override
	public void beforeJob(JobExecution jobExecution) {

		System.out.println("---->>> Job débute");

	}


}
