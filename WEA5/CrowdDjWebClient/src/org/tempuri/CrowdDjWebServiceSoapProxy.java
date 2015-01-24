package org.tempuri;

public class CrowdDjWebServiceSoapProxy implements org.tempuri.CrowdDjWebServiceSoap {
  private String _endpoint = null;
  private org.tempuri.CrowdDjWebServiceSoap crowdDjWebServiceSoap = null;
  
  public CrowdDjWebServiceSoapProxy() {
    _initCrowdDjWebServiceSoapProxy();
  }
  
  public CrowdDjWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCrowdDjWebServiceSoapProxy();
  }
  
  private void _initCrowdDjWebServiceSoapProxy() {
    try {
      crowdDjWebServiceSoap = (new org.tempuri.CrowdDjWebServiceLocator()).getCrowdDjWebServiceSoap();
      if (crowdDjWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)crowdDjWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)crowdDjWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (crowdDjWebServiceSoap != null)
      ((javax.xml.rpc.Stub)crowdDjWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CrowdDjWebServiceSoap getCrowdDjWebServiceSoap() {
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap;
  }
  
  public org.tempuri.Party[] getAllPartysForUser(org.tempuri.User u) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getAllPartysForUser(u);
  }
  
  public int getUserLogin(org.tempuri.User u) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getUserLogin(u);
  }
  
  public boolean registerUser(org.tempuri.User u) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.registerUser(u);
  }
  
  public org.tempuri.Party[] listMyPartys(org.tempuri.User u) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.listMyPartys(u);
  }
  
  public org.tempuri.Party[] listAllPartysByDate(java.util.Calendar from, java.util.Calendar to) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.listAllPartysByDate(from, to);
  }
  
  public boolean addUserToParty(org.tempuri.User u, org.tempuri.Party p, java.lang.String code) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.addUserToParty(u, p, code);
  }
  
  public boolean suggestTrack(org.tempuri.User u, org.tempuri.Track t, org.tempuri.Party p) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.suggestTrack(u, t, p);
  }
  
  public boolean voteForTrack(org.tempuri.User u, org.tempuri.Track t, org.tempuri.Party p) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.voteForTrack(u, t, p);
  }
  
  public org.tempuri.Partytweet[] getPartyTweets(org.tempuri.Party p) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getPartyTweets(p);
  }
  
  public boolean tweetMessage(org.tempuri.User u, org.tempuri.Party p, org.tempuri.Partytweet tweet) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.tweetMessage(u, p, tweet);
  }
  
  public org.tempuri.Party getPartyByName(java.lang.String name) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getPartyByName(name);
  }
  
  public org.tempuri.Track[] getTrackList(org.tempuri.Party p) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getTrackList(p);
  }
  
  public org.tempuri.Track[] getMyTracks(org.tempuri.User u) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getMyTracks(u);
  }
  
  public org.tempuri.Track getTrackById(int id) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.getTrackById(id);
  }
  
  public boolean createTrack(org.tempuri.Track t) throws java.rmi.RemoteException{
    if (crowdDjWebServiceSoap == null)
      _initCrowdDjWebServiceSoapProxy();
    return crowdDjWebServiceSoap.createTrack(t);
  }
  
  
}