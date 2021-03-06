/*
 * Copyright (C) 1996-2015 The Squid Software Foundation and contributors
 *
 * Squid software is distributed under GPLv2+ license and includes
 * contributions from numerous individuals and organizations.
 * Please see the COPYING and CONTRIBUTORS files for details.
 */

#ifndef _SQUID_AUTH_NTLM_USER_H
#define _SQUID_AUTH_NTLM_USER_H

#include "auth/User.h"

namespace Auth
{

class Config;

namespace Ntlm
{

/** User credentials for the NTLM authentication protocol */
class User : public Auth::User
{
    MEMPROXY_CLASS(Auth::Ntlm::User);

public:
    User(Auth::Config *, const char *requestRealm);
    virtual ~User();
    virtual int32_t ttl() const override;

    /* Auth::User API */
    static CbcPointer<Auth::CredentialsCache> Cache();
    virtual void addToNameCache() override;

    dlink_list proxy_auth_list;
};

} // namespace Ntlm
} // namespace Auth

#endif /* _SQUID_AUTH_NTLM_USER_H */

