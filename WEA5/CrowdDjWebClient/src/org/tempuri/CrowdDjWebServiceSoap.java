/**
 * CrowdDjWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CrowdDjWebServiceSoap extends java.rmi.Remote {
    public org.tempuri.Party[] getAllPartysForUser(org.tempuri.User u) throws java.rmi.RemoteException;
    public int getUserLogin(org.tempuri.User u) throws java.rmi.RemoteException;
    public boolean registerUser(org.tempuri.User u) throws java.rmi.RemoteException;
    public org.tempuri.Party[] listMyPartys(org.tempuri.User u) throws java.rmi.RemoteException;
    public org.tempuri.Party[] listAllPartysByDate(java.util.Calendar from, java.util.Calendar to) throws java.rmi.RemoteException;
    public boolean addUserToParty(org.tempuri.User u, org.tempuri.Party p, java.lang.String code) throws java.rmi.RemoteException;
    public boolean suggestTrack(org.tempuri.User u, org.tempuri.Track t, org.tempuri.Party p) throws java.rmi.RemoteException;
    public boolean voteForTrack(org.tempuri.User u, org.tempuri.Track t, org.tempuri.Party p) throws java.rmi.RemoteException;
    public org.tempuri.Partytweet[] getPartyTweets(org.tempuri.Party p) throws java.rmi.RemoteException;
    public boolean tweetMessage(org.tempuri.User u, org.tempuri.Party p, org.tempuri.Partytweet tweet) throws java.rmi.RemoteException;
    public org.tempuri.Party getPartyByName(java.lang.String name) throws java.rmi.RemoteException;
    public org.tempuri.Track[] getTrackList(org.tempuri.Party p) throws java.rmi.RemoteException;
    public org.tempuri.Track[] getMyTracks(org.tempuri.User u) throws java.rmi.RemoteException;
    public org.tempuri.Track getTrackById(int id) throws java.rmi.RemoteException;
    public boolean createTrack(org.tempuri.Track t) throws java.rmi.RemoteException;
}
