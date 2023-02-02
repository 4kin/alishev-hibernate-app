create table person
(
    id   integer generated always as identity
        primary key,
    name varchar(100),
    age  integer
);

alter table person
    owner to postgres;

INSERT INTO public.person (name, age) VALUES (null, null);
INSERT INTO public.person (name, age) VALUES (null, null);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
INSERT INTO public.person (name, age) VALUES ('Test1', 31);
INSERT INTO public.person (name, age) VALUES ('Test2', 32);
