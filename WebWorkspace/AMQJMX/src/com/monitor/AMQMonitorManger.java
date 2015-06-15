package com.monitor;

import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.apache.activemq.broker.jmx.BrokerViewMBean;
import org.apache.activemq.broker.jmx.QueueViewMBean;

public class AMQMonitorManger
{

	public static void main(String[] args) throws Exception
	{
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
		JMXConnector connector = JMXConnectorFactory.connect(url, null);
		connector.connect();
		MBeanServerConnection connection = connector.getMBeanServerConnection();
		ObjectName name = new ObjectName("my-broker:BrokerName=FooBroker,Type=Broker");

		BrokerViewMBean mbean = (BrokerViewMBean) MBeanServerInvocationHandler.newProxyInstance(
				connection, name, BrokerViewMBean.class, true);

		for (ObjectName queueName : mbean.getQueues())
		{
			QueueViewMBean queueMbean = (QueueViewMBean) MBeanServerInvocationHandler
					.newProxyInstance(connection, queueName, QueueViewMBean.class, true);

			if (queueMbean.getName().equals("TEST.Q1"))
			{
				System.out.println("enqueueCount: " + queueMbean.getEnqueueCount());
				System.out.println("dequeueCount: " + queueMbean.getDequeueCount());
				System.out.println("inFlightCount: " + queueMbean.getInFlightCount());
			}

		}
	}
}
