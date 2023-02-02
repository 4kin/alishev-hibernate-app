create table item
(
    id        integer generated by default as identity
        primary key,
    person_id integer
                           references person
                               on delete set null,
    item_name varchar(100) not null
);

alter table item
    owner to postgres;

INSERT INTO public.item (id, person_id, item_name) VALUES (1, 6, 'Ipasd');
INSERT INTO public.item (id, person_id, item_name) VALUES (2, 6, 'Iprggbf56ghbasd');
INSERT INTO public.item (id, person_id, item_name) VALUES (3, 10, 'Ipas45rtd4');
INSERT INTO public.item (id, person_id, item_name) VALUES (4, 10, 'Ibsfbfghfpasd');
INSERT INTO public.item (id, person_id, item_name) VALUES (5, 11, 'Ipa546sd');
INSERT INTO public.item (id, person_id, item_name) VALUES (6, 11, 'Ipa0-0-sd');
INSERT INTO public.item (id, person_id, item_name) VALUES (7, 11, 'I6987978pasd');
