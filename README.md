# SpringBoot- Spring Data and MongoDB

Sample project which shows how to use Spring Data with MongoDb

<h4>Installation and Getting Started</h4>

<ul>
<li>
1. Clone this repo and import this project in Spring Tool Suite.
</li>
<li>
2. Install MongoDb from <a href="https://www.mongodb.org/downloads">this</a> link.
</li>
<li>
3. If you are getting any error symbol in imported project, then update project using 'Maven'.
</li>
<li>
4. All documents are present in com.zishan.mongo.document and all repositories are in com.zishan.mongo.repository package. You can create your own document and repository in the same way.
<li>
5. If you want to change mongo db connection, then check out application.propeties file present in src/main/resources.
</li>
<li>
6. Run the project by right clicking on project, Run As -> Run on Server.
</li>
<li>
7. Open RestController.java file present in com.zishan.spring. You can see request mapping of class and methods in this file. So, now you can assess the web services like <a href="http://localhost:8080/SpringMongoDb/mongo/getAllBloodGroup">http://localhost:8080/SpringMongoDb/mongo/getAllBloodGroup</a>. You can also expose your own web service by creating new method and having @RequestMapping.
</li>
<li>
8. Also, you can create your own derived query by creating new method in repository using name of document attribute. Check out BloodGroupRepository.java file present in com.zishan.mongo.repository package for practical example.
</li>
</ul>
