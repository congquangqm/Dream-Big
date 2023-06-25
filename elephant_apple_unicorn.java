public class DreamBig {

public static void main(String[] args) {
	//Prints "Dream Big" on the console
System.out.println("Dream Big");

//Initializes an integer variable 
int num = 10;

//Prints the value of 'num'
System.out.println(num);

//Initializes a double variable
double num2 = 1.5;

//Prints the value of 'num2'
System.out.println(num2);

//Creates a new String object
String str = new String("Dream Bigger!");

//Prints the value of 'str'
System.out.println(str);

//Initializes an array of integers
int[] arr = {1, 2, 3, 4, 5};

//Iterates over the array and prints each element
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

//Initializes a 2D array of doubles
double[][] arr2 = {{1.1, 1.2, 1.3}, {2.1, 2.2, 2.3}, {3.1, 3.2, 3.3}};

//Iterates over the 2D array and prints each element
for (int i = 0; i < arr2.length; i++) {
	for (int j = 0; j < arr2[i].length; j++) {
		System.out.println(arr2[i][j]);
	}
}

//Creates an object of the StringBuilder class
StringBuilder sb = new StringBuilder();

//Appends a string to the StringBuilder object
sb.append("Dream Bigger and Bigger!");

//Prints the value of the StringBuidler object
System.out.println(sb.toString());

//Creates an object of the Calendar class
Calendar cal = Calendar.getInstance();

//Prints the current date
System.out.println(cal.getTime());

//Creates a new File object
File file = new File("dream_big.txt");

//Writes text to the file
try {
	PrintWriter writer = new PrintWriter(file);
	writer.println("Dream Biggest!");
	writer.close();
} catch (IOException e) {
	e.printStackTrace();
}

//Reads text from the file
try {
	BufferedReader reader = new BufferedReader(new FileReader(file));
	String line;
	while ((line = reader.readLine()) != null) {
		System.out.println(line);
	}
	reader.close();
} catch (IOException e) {
	e.printStackTrace();
}

//Initializes a new Date object
Date date = new Date();

//Formats the date using the SimpleDateFormat class
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//Prints the formatted date
System.out.println(sdf.format(date));

//Creates a new HashMap object
HashMap<String, String> map = new HashMap<>();

//Puts key-value pairs in the HashMap object
map.put("Dream", "Biggest!");

//Iterates over the HashMap object and prints each entry
for (String key : map.keySet()) {
	System.out.println(key + " : " + map.get(key));
}

//Creates a new thread
Thread t = new Thread(() -> System.out.println("Dream Biggest!!"));

//Starts the thread
t.start();

//Initializes an AtomicInteger object
AtomicInteger ai = new AtomicInteger();

//Replaces a given value with a new value
ai.compareAndSet(0, 10);

//Prints the value of the AtomicInteger object
System.out.println(ai.get());

//Creates a new BigInteger object
BigInteger bi = new BigInteger("1000000000000");

//Multiplies the BigInteger object with 10
bi = bi.multiply(BigInteger.TEN);

//Prints the BigInteger object
System.out.println(bi);

//Creates a new LinkedList object
LinkedList<Integer> list = new LinkedList<>();

//Adds elements to the list
list.add(1);
list.add(2);
list.add(3);

//Iterates over the list and prints each element
for (int i : list) {
	System.out.println(i);
}

//Creates a new tree
TreeMap<Integer, String> tree = new TreeMap<>();

//Puts key-value pairs in the tree
tree.put(1, "Dream");
tree.put(2, "Biggest!");

//Iterates over the tree and prints each entry
for (int key : tree.keySet()) {
	System.out.println(key + " : " + tree.get(key));
}

//Initializes a 2D array of characters
char[][] arr3 = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}};

//Iterates over the 2D array and prints each element
for (int i = 0; i < arr3.length; i++) {
	for (int j = 0; j < arr3[i].length; j++) {
		System.out.println(arr3[i][j]);
	}
}

//Creates a new PriorityQueue object
PriorityQueue<Integer> pq = new PriorityQueue<>();

//Adds elements to the PriorityQueue
pq.add(1);
pq.add(2);
pq.add(3);

//Removes the first element from the PriorityQueue
System.out.println(pq.poll());

//Creates a new stack
Stack<String> stack = new Stack<>();

//Pushes elements to the stack
stack.push("Dream");
stack.push("Biggest!");

//Removes the top element from the stack
System.out.println(stack.pop());

//Creates a new vector
Vector<String> vector = new Vector<>();

//Adds elements to the vector
vector.add("Dream");
vector.add("Biggest!");

//Prints the first element of the vector
System.out.println(vector.firstElement());

//Creates a new URL object
URL url = new URL("http://example.com/dream_big.html");

//Opens a connection to the URL
try {
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	InputStream is = connection.getInputStream();
	BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	String line;
	while ((line = reader.readLine()) != null) {
		System.out.println(line);
	}
	reader.close();
} catch (IOException e) {
	e.printStackTrace();
}

//Creates a new socket
Socket socket = new Socket("example.com", 80);

//Writes data to the socket
try {
	PrintWriter writer = new PrintWriter(socket.getOutputStream());
	writer.println("Dream Biggest!!");
	writer.flush();
	writer.close();
} catch (IOException e) {
	e.printStackTrace();
}

//Reads data from the socket
try {
	BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	String line;
	while ((line = reader.readLine()) != null) {
		System.out.println(line);
	}
	reader.close();
} catch (IOException e) {
	e.printStackTrace();
}

//Creates a new server socket
ServerSocket sSocket = new ServerSocket(8080);

//Accepts a connection from the client
try {
	Socket clientSocket = sSocket.accept();
	System.out.println("Client connected!");
} catch (IOException e) {
	e.printStackTrace();
}

//Creates an object of the ExecutorService class
ExecutorService exec = Executors.newSingleThreadExecutor();

//Executes a given task in a separate thread
exec.execute(() -> System.out.println("Dream Biggest!!!"));

//Shuts down the executor service
exec.shutdown();

//Creates an object of the Logger class
Logger logger = Logger.getLogger("DreamBig");

//Logs a message
logger.info("Dream Biggest!!!!");

}

}