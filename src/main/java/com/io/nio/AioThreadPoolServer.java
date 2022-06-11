package com.io.nio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lihaocheng
 * @createtime 2022/5/21
 */
public class AioThreadPoolServer {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(10,10,100, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        ServerSocket serverSocket = new ServerSocket(8801);
        while (true) {
            try {
                final Socket socket=serverSocket.accept();
                threadPoolExecutor.execute(()->{
                    service(socket);
                });
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket){
        try {
            Thread.sleep(10);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            printWriter.println();
            printWriter.write("hello,nio");
            printWriter.close();
            socket.close();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
