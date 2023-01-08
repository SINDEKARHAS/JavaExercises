package exercises;

public class Javaexercise38 {
	
 @BeforeAll
 static void beforeAll() {
 System.out.println("Connect to the database");
 }
 
 @BeforeEach
 void beforeEach() {
 System.out.println("Load the schema");
 }
 
 @AfterEach
 void afterEach() {
 System.out.println("Drop the schema");
 }
 
 @AfterAll
 static void afterAll() {
 System.out.println("Disconnect from the database");
 }
 
 @Test
 void testOne() {
 System.out.println("Test One");
 }
 
 @Test
 void testTwo() {
 System.out.println("Test Two");
 }
}