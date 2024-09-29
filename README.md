# Keycloak Notes

## Realms

- `Realms` are the structures that allow an administrator to create isolated
  groups of applications and users. Keycloak describes `realms` as tenants
  in Keycloak.
    - Master realm is just to manage keycloak

## Clients

- `client` are applications and services that can request authentication of
  a user

## Composite Roles

- A composite role in Keycloak is a specialized role that can encompass one or
  more other roles. This feature allows for the aggregation of permissions,
  simplifying role management. When a user is assigned a composite role, they
  automatically inherit all the roles associated with it, which can streamline
  access control across applications.