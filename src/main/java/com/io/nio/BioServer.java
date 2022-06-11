package com.io.nio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lihaocheng
 * @createtime 2022/5/21
 */
public class BioServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8801);
        while (true) {
            try {
                Socket socket=serverSocket.accept();
                service(socket);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket) throws IOException {
        try {
            Thread.sleep(10);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            printWriter.println();
            printWriter.write("hello,nio");
            printWriter.close();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }
}
