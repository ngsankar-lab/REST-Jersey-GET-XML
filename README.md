# REST-Jersey-GET-XML
REST Implementation using Jersey with GET and XML

Sample REST Implementation using Jersey.
Created a POJO Person bean.
Created a PersonResouce class, Set the values of Person like id and name.
Used below annotations.
  @Path
  @GET
  @Produces(MediaType.APPLICATION_XML)
  @XmlRootElement //to the POJO class
