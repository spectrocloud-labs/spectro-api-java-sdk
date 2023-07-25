# V1OpenIDProviderMetadataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorizationEndpoint** | **String** | REQUIRED. URL of the OP&#x27;s OAuth 2.0 Authorization Endpoint |  [optional]
**claimsSupported** | **String** | RECOMMENDED. JSON array containing a list of the Claim Names of the Claims that the OpenID Provider MAY be able to supply values for |  [optional]
**idTokenSigningAlgValuesSupported** | **Object** | REQUIRED. JSON array containing a list of the JWS signing algorithms (alg values) supported by the OP for the ID Token to encode the Claims in a JWT |  [optional]
**issuer** | **String** | REQUIRED. URL using the https scheme with no query or fragment component that the OP asserts as its Issuer Identifier |  [optional]
**jwksUri** | **String** | REQUIRED. URL of the OP&#x27;s JSON Web Key Set [JWK] document. |  [optional]
**registrationEndpoint** | **String** | RECOMMENDED. URL of the OP&#x27;s Dynamic Client Registration Endpoint |  [optional]
**responseTypesSupported** | **String** | REQUIRED. JSON array containing a list of the OAuth 2.0 response_type values that this OP supports |  [optional]
**scopesSupported** | **String** | RECOMMENDED. JSON array containing a list of the OAuth 2.0 [RFC6749] scope values that this server supports |  [optional]
**subjectTypesSupported** | **String** | REQUIRED. JSON array containing a list of the Subject Identifier types that this OP supports |  [optional]
**tokenEndpoint** | **String** | URL of the OP&#x27;s OAuth 2.0 Token Endpoint |  [optional]
**userinfoEndpoint** | **String** | RECOMMENDED. URL of the OP&#x27;s UserInfo Endpoint |  [optional]
