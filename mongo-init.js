db.createUser(
        {
            user: "dg-scorecard-usr",
            pwd: "dg-scorecard-usr",
            roles: [
                {
                    role: "readWrite",
                    db: "dg-scorecard"
                }
            ]
        }
);