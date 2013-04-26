package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.model;

import javax.persistence.*;


/**
 * Date:   3/11/13 / 10:52 AM
 * Author: Johnathan Mark Sm10:53 AM
 * mail:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 */


@Entity
@Table(name = "messages")
public class Message
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "message")
    private String message;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "Message{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}