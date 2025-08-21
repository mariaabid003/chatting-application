Chatting Application 
Explanation:
This project consists of a simple chat application with a graphical user interface (GUI) implemented in Java using the Swing library. The chat application consists of a server and a client. The server and client communicate with each other over a network using sockets. The GUI is created using JFrame, JPanel, and other Swing components. There are two classes made in this project. Server and Client.

Server Class                                                                                                                                                                                     
GUI Components:
The server GUI has a title bar with user information (name, profile picture, status).It includes icons for various functionalities like video call, phone call, etc. The chat area is represented by a JPanel (a1) where messages are displayed.
Sending Messages:
The server can type messages in the JText Field at the bottom and send them by clicking the "Send" button. The action Performed method handles sending messages. 
Formatting Messages
The format Label method is responsible for formatting messages in a JPanel.
Messages are displayed with a background color, and each message includes a timestamp.
Linked List Usage
A Linked List named chat Messages is used to store and manage chat messages.
For each message sent or received, a Message object is created and added to the chat Messages list.
The Linked List is used to keep track of messages and their senders.

Server Socket and Socket:
The server uses a Server Socket to listen for incoming client connections on port 6001.
For each client connection, a new socket is created, and communication is established.

Client Class                                                                                                                                                                                                    Similar GUI Components:
The client GUI is similar to the server GUI, with a title bar, icons, and a chat area.
Sending and Receiving Messages:
Similar to the server, the client can send messages, and the action Performed method handles this.
The client continuously listens for incoming messages using a loop and displays them in the chat area.
Linked List Usage (Client):
Like the server, the client also uses a Linked List (chat Messages) to store and manage chat messages.
For each message sent or received, a Message object is created and added to the chat Messages list.
Socket Connection:
The client connects to the server using a Socket on the local host (127.0.0.1) and port 6001.
Console Output (Debugging):
Both the server and client print messages to the console for debugging purposes. 

<img width="553" height="866" alt="image" src="https://github.com/user-attachments/assets/3cf7396f-b297-4248-b0ed-71666b5bd75b" />

<img width="553" height="838" alt="image" src="https://github.com/user-attachments/assets/a001f0fa-d754-4d72-b6b1-7aed8baf3ac8" />


Linked List Implementation                                                                                                                                                                            Linked list plays a very important role in this project. Each time a message is sent or received, a Message object is created with details like content, sender, and timestamp.
The chat Messages Linked List stores these Message objects.
The Linked List is then used to iterate over and print the messages in the console, showing the content and sender.
