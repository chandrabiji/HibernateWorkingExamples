# Hibernate Running Class Applications
  ## 1. Hibernate First Application
     - step1: Create a Maven Project along with following maven dependecies
              <dependencies>
                <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
		            <dependency>
		          	<groupId>org.hibernate</groupId>
		            	<artifactId>hibernate-core</artifactId>
	            		<version>5.4.21.Final</version>
	            	</dependency>
	            	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
            		<dependency>
            			<groupId>mysql</groupId>
	             		<artifactId>mysql-connector-java</artifactId>
	            		<version>8.0.20</version>
	          	</dependency>
              </dependencies>
                
     -  step2: Create a Pojo Class(src/main/java)  
              package com.chandra.hibernate;  
              public class Product {  
            	private int pid;  
            	private String pname;  
            	private int qty;  
            	private double price;  
            	public int getPid() {
		            return pid;
	            }
	            public void setPid(int pid) {
            		this.pid = pid;
	            }
            	public String getPname() {
	            	return pname;
            	}
            	public void setPname(String pname) {
             		this.pname = pname;
            	}
	            public int getQty() {
	            	return qty;
            	}
	            public void setQty(int qty) {
	            	this.qty = qty;
	            }
            	public double getPrice() {
	            	return price;
	            }
          	public void setPrice(double price) {
          		this.price = price;
          	}
          }  
     -  step3:Create a Hibernate Mapping  
         <?xml version="1.0"?>
          <!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
          "http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">
          <!-- Generated 11 Jan, 2021 6:26:07 AM by Hibernate Tools 3.5.0.Final -->
          <hibernate-mapping>
          <class name="com.chandra.hibernate.Product" table="PRODUCT">
           <id name="pid" type="int">
             <column name="PID" />
             <generator class="assigned" />
            </id>
           <property name="pname" type="java.lang.String">
             <column name="PNAME" />
            </property>
           <property name="qty" type="int">
             <column name="QTY" />
           </property>
           <property name="price" type="double">
            <column name="PRICE" />
           </property>
         </class>
        </hibernate-mapping>  
    -  step 4:Create Hibernate Configuration file.(src/main/resource)
               <?xml version="1.0" encoding="UTF-8"?>
              <!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
                                         "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
              <hibernate-configuration>
                <session-factory>
                   <property name="hbm2ddl.auto">update</property>
                   <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
                   <property name="hibernate.connection.password">root</property>
                   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/6amist</property>
                   <property name="hibernate.connection.username">root</property>
                   <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
                   <property name="show_sql">true</property>
                   <property name="format_sql">true</property>
                   <mapping resource="com/chandra/hibernate/Product.hbm.xml"/>
                  </session-factory>
              </hibernate-configuration>  
      -  step 5: Create Hibernate Client Application(src/main/java)
                 package com.chandra.hibernate;
                 import org.hibernate.Session;
                 import org.hibernate.SessionFactory;
                 import org.hibernate.Transaction;
                 import org.hibernate.cfg.Configuration;
                 public class Test {
                	public static void main(String[] args) {
	                	Configuration cfg = new Configuration();
	                	cfg.configure();
	                 	SessionFactory sf = cfg.buildSessionFactory();
	                 	Session s = sf.openSession();
	                	Transaction tx = s.beginTransaction();
		              	Product p = new Product();
	                	p.setPid(2);
	                	p.setPname("SOAP");
	                	p.setQty(1);
	                	p.setPrice(120);
	              		s.save(p);
                		tx.commit();
                		s.close();
                  	}
                  }  
  ## Hibernate_CURD Application using annotation Based
     -  Here redusing xml mapping file remaining steps are same
  
 ## Hibernate Session Object States
    -  Hibernate Session Object Basically 4 states   
      --  Transient  
      --  Persistent  
      --  Detached  
      --  Remove  
          -->Check applications once.  

 ## Hibernate One - To - One Relationship  
     -- Two Entity classes level relation ship  
		  
# Note : Regular Online Training sessions Please contact through WhatsApp : +91-9866037742 / Email Id: chandramca04@gmail.com / skype Id: chandra.b3

    
     

          
