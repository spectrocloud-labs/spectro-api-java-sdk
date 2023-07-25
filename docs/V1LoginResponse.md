# V1LoginResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appEnv** | **String** | Describes the env type. Possible values [ saas, self-hosted, quick-start, enterprise, airgap] |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Describes the default mode of authentication. Possible values [password, sso] |  [optional]
**orgName** | **String** | Organization name. |  [optional]
**redirectUrl** | **String** | Describes the default redirect Url for authentication. If authType is sso, it will have tenant configured saml/oidc idp url else it will be users organization url |  [optional]
**rootDomain** | **String** | Describes the domain url on which the saas is available |  [optional]
**ssoLogins** | [**V1SsoLogins**](V1SsoLogins.md) |  |  [optional]
**totalTenants** | [**BigDecimal**](BigDecimal.md) | Describes the total number of tenant present in the system |  [optional]

<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
PASSWORD | &quot;password&quot;
SSO | &quot;sso&quot;
